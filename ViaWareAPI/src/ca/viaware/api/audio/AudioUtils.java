package ca.viaware.api.audio;

import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class AudioUtils {

	public static void playRaw(AudioInputStream input, AudioFormat format) {
		try{
			SourceDataLine dataLine = AudioSystem.getSourceDataLine(format);

			dataLine.open();
			dataLine.start();

			byte[] buffer = new byte[1024];
			int read;
			try {
				while ((read = input.read(buffer)) != -1) {
						dataLine.write(buffer, 0, read);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			dataLine.drain();
			dataLine.stop();
			dataLine.close();
		}catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}

}
