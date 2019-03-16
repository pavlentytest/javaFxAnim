package application;

import javafx.scene.image.Image;

public class AnimatedImage {

	public Image[] frames;
	public double duration;
	
	
	public Image getFrame(double time) {
		// 0 - 5
		int index = (int) ((time%(frames.length*duration))/duration);
		System.out.println(index);
		return frames[index];
	}
}
