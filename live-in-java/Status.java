package com.max.idea;

public enum Status {
    NONE,
    BORN,
    LIVE,
    DIED;

    public Status step1(int around){

        switch (this){

            case NONE : return (around >= 3) ? BORN : NONE;

            case LIVE : return (around <=1 || around >= 4) ? DIED : LIVE;

            default   : return this;

        }
    }

    public Status step2 () {
        switch (this){

            case BORN : return LIVE;

            case DIED : return NONE;

            default   : return this;
        }
    }

    public boolean isCell(){

        return this == LIVE || this == DIED;

    }
}
