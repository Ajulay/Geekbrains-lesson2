package net.zt.funcode.components;

import net.zt.funcode.annotation.UnproducableCameraRoll;
import org.springframework.stereotype.Component;

@Component("cameraRoll")
@UnproducableCameraRoll(usingCameraRollClass=BlackAndWhiteCameraRoll.class)
public class ColorCameraRoll implements CameraRoll {

	public void processing() {
		// TODO Auto-generated method stub
		System.out.println("-1 цветной кадр");
		
	}

	
	
	
	

	
	
	
	
	
	

}
