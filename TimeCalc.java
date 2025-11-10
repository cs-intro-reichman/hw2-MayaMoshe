public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0]; //קלט של השעה
        int minutesToAdd = Integer.parseInt(args[1]); //קלט של מס׳ הדקות שרוצים להוסיף
        int colonIndex = time.indexOf(':'); //מציאת האינדקס של הנקודתיים בשעה 
        String hour = time.substring(0, colonIndex);
        String minute = time.substring(colonIndex+1); //מהסוגריים ועוד תו אחד
        int hour1 = Integer.parseInt(hour);
        int minute1 = Integer.parseInt(minute);
        int totalMinutes = hour1*60 + minute1 + minutesToAdd;
        hour1 = (totalMinutes/60)%24;
        minute1 =totalMinutes%60;
        if (hour1<10&&minute1<10){
            System.out.println("0"+hour1+":"+minute1+"0");
        }
        if (hour1<10){
            System.out.println("0"+hour1+":"+minute1);
        }
        else if (minute1<10){
            System.out.println(hour1+":0"+minute1);
        }
        else{
             System.out.println(hour1+":"+minute1);
        }

    }
}
