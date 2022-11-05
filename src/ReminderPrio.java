public class ReminderPrio {
    public static boolean reminderPriority = false;
    public static void setPriority(String prio){
        reminderPriority = prio.equals("yes");
    }
    private static boolean getPriority(){
        return reminderPriority;
    }
}
