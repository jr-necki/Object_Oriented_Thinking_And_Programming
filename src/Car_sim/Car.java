package Car_sim;

public abstract class Car {
    //여기는 틀
    double currentSpeed = 0;
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    protected void setCurrentSpeed(double currentSpeed) {
        if(currentSpeed > 250) return;

        this.currentSpeed = currentSpeed;
    }

    int runningTime = 0;
    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public void accelerateOneSecond(){
        setCurrentSpeed((100 / getZeroToHundred()) * getRunningTime() );
        setRunningTime(getRunningTime() + 1);
    }

    // 여기 아래가 채워져야만 완전해짐
    abstract public double getZeroToHundred();

    abstract public double getCurrentFuelEconomy();
}
