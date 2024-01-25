package General;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Slot> day = new ArrayList<>();
        System.out.println("How many slots in a day?");
        int dayStart = 9;
        int dayEnd = 17;
        int slotsInDay = in.nextInt();

        for (int i = 0; i<slotsInDay;i++){
            System.out.println("Enter start and end time for the slot "+(i+1));
            int s = in.nextInt();
            int e = in.nextInt();
            day.add(new Slot(s, e));
        }

        day.forEach(System.out::println);

        List<Slot> free = new ArrayList<>();

        for (int i = 0; i < slotsInDay-1; i++){
            if (day.get(i).getEnd() != day.get(i+1).getStart()){
                free.add(new Slot(day.get(i).getEnd(), day.get(i+1).getStart()));
            }
        }

        System.out.println("\n Free slots");
        free.forEach(System.out::println);

        if (free.getFirst().getStart() > dayStart) {
            Slot morningFreeSlot = new Slot(dayStart, day.getFirst().getStart());
            int c = day.getFirst().getStart() - dayStart;
            System.out.println("Morning free slot time: "+c+" hr/hrs "+morningFreeSlot);
        } else System.out.println("No early free slot.");

        if (dayEnd > day.getLast().getEnd()) {
            Slot lastFreeSlot = new Slot(day.getLast().getEnd(), dayEnd);
            int c = dayEnd - day.getLast().getEnd();
            System.out.println("Evening free slot time: "+c+" hr/hrs "+lastFreeSlot);
        } else System.out.println("No last free slot.");


    }
}
