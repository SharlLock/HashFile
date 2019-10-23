package Hash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client {														//实现图形化界面的客户端窗口
	public static void main(String[] args) {							//main函数要简洁，创建出一个frame就结束
		SimpleFrame frame = new SimpleFrame();
		frame.setVisible(true);
		frame.setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hash Files");
		//窗体框架frame
	}
}

class SimpleFrame extends JFrame{
	public SimpleFrame() {
		//RandomAccess intandOut=new
		setSize(700,500);
		setLayout(new BorderLayout());
		SimplePanel panel = new SimplePanel();					//在窗口中添加组件面板
		add(panel,BorderLayout.SOUTH);
	}
}

class SimplePanel extends JPanel{
	//整理组件的面板,包括： 
	//功能按钮"buttons"
	//显示面板，显示所有目录项
	public SimplePanel() {
		setLayout(new BorderLayout());
		//设置面板为边缘布局
		
		JPanel button_pan = new JPanel();					//button_pan用来保存按钮
		JPanel area_pan = new JPanel();						//area_pan用来保存展示模版
		button_pan.setLayout(new GridLayout(3,1));
		
		JButton newfile = new JButton("新建");
		newfile.addActionListener(new CommandAction());
		button_pan.add(newfile);
		JButton search = new JButton("查找");
		search.addActionListener(new CommandAction());
		button_pan.add(search);
		JButton fresh = new JButton("刷新");
		fresh.addActionListener(new CommandAction());
		button_pan.add(fresh);
		add(button_pan,BorderLayout.SOUTH);
		
		//area用来显示文件目录项
		JTextArea area = new JTextArea(20,50);							//20x50的显示区域大小
		JScrollPane scroll = new JScrollPane(area);					//在文本显示区域加入滚动条
		area_pan.add(area);
		add(area_pan,BorderLayout.NORTH);
	}
}

class CommandAction implements ActionListener{
	//为按钮添加事件监听器
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String command = event.getActionCommand(); 
		if(command.equals("新建")) {
			//弹出窗口要求输入新建文件名称
			NewFileWindow newwindow = new NewFileWindow();
		}else if(command.equals("查找")) {
			//弹出窗口要求输入要查找的文件名称
		}else if(command.equals("刷新")) {
			//刷新显示文本面板
		}
	}
}
