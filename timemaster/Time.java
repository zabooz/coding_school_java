package timemaster;




class TimeCalc{

    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    int timeInSec = 0;
    String time = "";

    
    
    TimeCalc(){
        
    }
    
    TimeCalc(int hours,int minutes,int seconds){
        
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        timeInSec = hours *3600 + minutes *60 +seconds;
    }

    void formatTime(int timeInSec){

        this.hours = timeInSec /3600;
        this.minutes =(timeInSec%3600) / 60;
        this.seconds = timeInSec % 60;

        time  = String.format("%02d:%02d:%02d",this.hours,this.minutes,this.seconds);

    }



    public String getTime(){
        this.formatTime(this.timeInSec);
        return this.time;
    }

    public void setTime(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String add(int seconds){
        this.timeInSec += seconds;
        this.formatTime(timeInSec);
        return this.time;

    }
    public String add(int minutes,int seconds){

        this.timeInSec += seconds + minutes*60;
        this.formatTime(timeInSec);
        return this.time;

    }
    public String add (int hours, int minutes, int seconds){
        this.timeInSec += hours*3600 + minutes *60 + seconds;
        this.formatTime(timeInSec);
        return this.time;
    }
    public String add(TimeCalc time){
        this.timeInSec += time.timeInSec;
        this.formatTime(timeInSec);
        return this.time;
    }
    public String subtract (TimeCalc time){
        this.timeInSec -= time.timeInSec;
        this.formatTime(timeInSec);
        return this.time;
    }


}


public class Time {
    
    public static void timemaster(){

        TimeCalc t1 = new TimeCalc();
        TimeCalc t2 = new TimeCalc(3,20,45);
        TimeCalc t3 = new TimeCalc(1,20,45);

        System.out.println(t1.getTime());

    }




}
