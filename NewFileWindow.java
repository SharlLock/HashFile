package Hash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//当按下“新建”按钮的时候，弹出此窗口
public class NewFileWindow extends JFrame{
	//弹出窗口中包括一个文本框用来输入文件名称，右侧加2个按钮：“确定”和“取消”
	public NewFileWindow() {
		setTitle("新建文件");
		setVisible(true);
		setSize(300,100);
		JPanel panel = new JPanel();									//容纳文本框和两个按钮的面板
		JPanel b_panel = new JPanel();								//b_panel用来保存两个按钮
		JTextField text = new JTextField(20);						//长度为20个字符的文本输入框
		
		panel.setLayout(new BorderLayout());
		b_panel.setLayout(new BorderLayout());
		
		panel.add(text,BorderLayout.WEST);
		
		JButton yes = new JButton("确定");
		yes.addActionListener(new Listener());
		b_panel.add(yes,BorderLayout.WEST);
		JButton cancel = new JButton("取消");
		cancel.addActionListener(new Listener());
		b_panel.add(cancel,BorderLayout.EAST);
		
		panel.add(b_panel,BorderLayout.EAST);
		this.add(panel);
	}
}

class Listener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("确定")) {
			//新建Hash文件，同时关闭窗口
			hashfile_creat creat = new hashfile_creat();
			
		}else if(e.getActionCommand().equals("取消")) {
			//不进行任何操作，只是关闭此弹窗
			e.getSource()
		}
	}
}