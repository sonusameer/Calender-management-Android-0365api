package com.leibmann.android.myupcommingevents;

import java.io.Serializable;


public class SectionItem implements Serializable, Item {

    private static final long serialVersionUID = 0L;

    public ItemType isItemType() {
        return ItemType.Section;
    }

    protected String mUtcEventStartTime;

    public String getUtcEventStartTime() {
        return mUtcEventStartTime;
    }

    public void setUtcEventStartTime(String utcEventStartTime) {
        mUtcEventStartTime = utcEventStartTime;
    }

    public SectionItem(String utcEventStartTime) {
        mUtcEventStartTime = utcEventStartTime;
    }
}
