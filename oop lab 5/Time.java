public class Time {
    private int YEAR,MONTH,DAY,HOUR,MIN,SECS;

    //THIS IS THE DEFAULT CONSTRUCTOR
    public Time(){

    }

    //THIS IS THE SECOND OVERLOADED CONSTRUCTOR
    public Time(int YEAR,int MONTH,int DAY){
        this.YEAR = YEAR;
        this.MONTH = MONTH;
        this.DAY = DAY;
    }

    //THIS IS THE THIRD OVERLOADED CONSTRUCTOR
    public Time(int YEAR,int MONTH,int DAY,int HOUR,int MIN,int SECS){
        this.YEAR = YEAR;
        this.MONTH = MONTH;
        this.DAY = DAY;
        this.HOUR = HOUR;
        this.MIN = MIN;
        this.SECS = SECS;
    }

    //THESE ARE THE GETTERS AND SETTERS
    public int getYEAR() {
        return YEAR;
    }

    public void setYEAR(int yEAR) {
        YEAR = yEAR;
    }

    public int getMONTH() {
        return MONTH;
    }


    public void setMONTH(int mONTH) {
        MONTH = mONTH;
    }

    public int getDAY() {
        return DAY;
    }

    public void setDAY(int dAY) {
        DAY = dAY;
    }

    public int getHOUR() {
        return HOUR;
    }

    public void setHOUR(int hOUR) {
        HOUR = hOUR;
    }

    public int getMIN() {
        return MIN;
    }

    public void setMIN(int mIN) {
        MIN = mIN;
    }

    public int getSECS() {
        return SECS;
    }

    public void setSECS(int sECS) {
        SECS = sECS;
    }
    

}
