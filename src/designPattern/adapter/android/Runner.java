package designPattern.adapter.android;

import designPattern.adapter.ios.IphoneHeadset;

public class Runner {
    public static void main(String[] args) {
        AndroidHeadset an=new HeadsetAdapter();
//        IphoneHeadset ip=new IphoneHeadset();
        ListenMusic lm = new ListenMusic(an);

        lm.listenSong("Music...");
    }
}
