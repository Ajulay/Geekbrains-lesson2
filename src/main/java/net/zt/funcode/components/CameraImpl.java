package net.zt.funcode.components;

import net.zt.funcode.annotation.OtherCamera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@OtherCamera(usingCameraClass = MyCamera.class)
@Component("camera")
public class CameraImpl implements Camera {
	
	
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


	public boolean isBroken() {
		return broken;
	}

   public void breaking(){
	   
	   this.broken=true;
   }

   

	public void doPhotograph(){
		
		if(isBroken()){
			
			System.out.println("Фотоаппарат сломан!");
			return;
		}
		    System.out.println("Сделана фотография!");
		    cameraRoll.processing();
		
		
	}

	@PostConstruct
	public void ready() {
		
		System.out.println("Фотоаппарат готов к использованию!");
		
	}
	
	

}
