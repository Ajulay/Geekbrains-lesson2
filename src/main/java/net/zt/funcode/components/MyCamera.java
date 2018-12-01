package net.zt.funcode.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;


public class MyCamera implements Camera {

    @Autowired
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {

        if(isBroken()){

            System.out.println("Мой фотоаппарат сломан!");
            return;
        }
        System.out.println("Сделана фотография из моего фотоаппарата!");
        cameraRoll.processing();
    }

    public void breaking() {

        this.broken = true;
    }

    public boolean isBroken() {
        return broken;
    }

    @PostConstruct
    public void ready() {
        System.out.println("Мой фотоаппарат готов к использованию!");
    }
}
