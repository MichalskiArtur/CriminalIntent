package com.gmail.artur.michalski.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by AM on 28-Jan-15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public Crime() {
        // Generate unique identifire
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getmTitle() {
        return mTitle;
    }

    public UUID getmId() {
        return mId;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
