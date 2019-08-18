package com.geekqin.baselibs.basemvp.utils;

import android.content.Context;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import okhttp3.Dns;

/**
 * @author QinJun
 * @date 2019/5/21
 * @desc
 */
public class NetUtils implements Dns {
    private Context mContext;
    @Override
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        return null;
    }
    
}
