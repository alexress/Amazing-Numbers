class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        hours = minutes == 59 ? hours +1 : hours;
        hours = hours == 13 ? 1 : hours;
        minutes = (minutes + 1) % 60;
    }
}