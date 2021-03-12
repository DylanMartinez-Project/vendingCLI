package com.techelevator;

public class Television {

    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;


    public void turnOff() {
        this.isOn= false;
    }
    public void turnOn() {
        this.isOn = true;
    }
    public void changeChannel(int newChannel) {
        if(this.isOn){
            this.currentChannel = newChannel;
        }
    }
    public void channelUp() {
        if(this.isOn){
            currentChannel++;
            if (currentChannel> 18){
                currentChannel = 3;
            }
        }
    }
    public void channelDown() {
        if(this.isOn){
            currentChannel = currentChannel -1;
            if(currentChannel< 3){
                currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if (this.isOn){
            if(currentVolume < 10){
                currentVolume = currentVolume + 1;
            }
        }
    }
    public void lowerVolume() {
        if(this.isOn){
            if(currentVolume> 0){
                currentVolume = currentVolume - 1;
            }
        }
    }





    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
