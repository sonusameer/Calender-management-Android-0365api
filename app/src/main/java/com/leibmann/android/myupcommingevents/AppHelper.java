package com.leibmann.android.myupcommingevents;

import java.io.Closeable;
import java.io.IOException;

public class AppHelper {
    public static void close(Closeable obj){
        if(obj!=null){
            try {
                obj.close();
            }catch (IOException e){
                //ignore
            }
        }
    }
}
