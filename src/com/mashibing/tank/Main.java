package com.mashibing.tank;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        //新建windows窗口
        TankFrame tf = new TankFrame();

        int initTankCount = Integer.parseInt((String) PropertyMgr.getProps().get("initTankCount"));

        for (int i = 0; i < initTankCount; i++){
            tf.tanks.add(new Tank(50+i*80, 200, Dir.DOWN, Group.BAD, tf));
        }

        while (true){
            Thread.sleep(50);
            tf.repaint();
        }
    }

}
