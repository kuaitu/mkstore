package com.mkstore.mk.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class ImageUtil {
	/**
	 * 将原始图片，修改到目标高宽
	 * 
	 * @param in
	 *            图片输入IO
	 * @param out
	 *            图片输出IO
	 * @param width
	 *            目标宽度
	 * @param height
	 *            目标高度
	 * @throws IOException
	 *             读写异常
	 */
	public static void makeSmallImage(InputStream in, OutputStream out,
			int width, int height) throws IOException {
		BufferedImage image = ImageIO.read(in);

		BufferedImage bfImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		
		Graphics2D g2d = bfImage.createGraphics();  
		bfImage = g2d.getDeviceConfiguration().createCompatibleImage(width, height,
                Transparency.TRANSLUCENT);  
        g2d.dispose();
        g2d = bfImage.createGraphics();
        Image from = image.getScaledInstance(width, height, BufferedImage.SCALE_AREA_AVERAGING);
        g2d.drawImage(from, 0, 0, null);
        g2d.dispose();

		ImageIO.write(bfImage, "png", out);
		out.close();
	}
}
