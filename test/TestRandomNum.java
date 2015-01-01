import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class TestRandomNum extends Frame {
	
	public void paint(Graphics g) {
		int width = 60, height = 20;
		//BufferedImage image = new BufferedImage(width, height,
			//	BufferedImage.TYPE_INT_RGB);
		// ��ȡͼ��������
		//g = image.getGraphics();
		// ���������
		Random random = new Random();
		//�趨����ɫ
		g.setColor(getRandColor(200, 250));
		//g.setColor(Color.green);
		g.fillRect(50, 50, width, height);
		// �趨����
		g.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		// �������155�������ߣ�ʹͼ���е���֤�벻�ױ���������̽�⵽
		g.setColor(getRandColor(160, 200));
		for (int i = 0; i < 155; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(12);
			int yl = random.nextInt(12);
			g.drawLine(x, y, x + xl, y + yl);
		}
		// ȡ�����������֤��(4λ����)
		String sRand = "";
		for (int i = 0; i < 4; i++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;
			// ����֤����ʾ��ͼ����
			g.setColor(new Color(20 + random.nextInt(110), 20 + random
					.nextInt(110), 20 + random.nextInt(110)));
			// ���ú�����������ɫ��ͬ����������Ϊ����̫�ӽ�������ֻ��ֱ������
			g.drawString(rand, 13 * i + 55, 70);
		}
	}
	private Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
	

	public void lauchFrame() {
		this.setLocation(400, 300);
		this.setSize(800, 600);
		this.setTitle("TankWar");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		TestRandomNum tc = new TestRandomNum();
		tc.lauchFrame();
	}

}
