/**
Copyright 2014 Miyuru Dayarathna

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.streamfarm.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JTextArea;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import org.streamfarm.comm.FarmManagerProtocol;
import org.streamfarm.utils.Conts;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.SwingConstants;

/**
 * @author miyuru
 *
 */
public class StreamFarmUI extends JFrame {

	private JPanel contentPane;
	private String farmManagerHost;
	private JLabel labelStatus;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StreamFarmUI frame = new StreamFarmUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StreamFarmUI() {
		farmManagerHost = null;
		
		setAlwaysOnTop(true);
		setTitle("StreamFarm UI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 393);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);
		
		JMenuItem mntmConnect = new JMenuItem("Connect");
		mntmConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StreamFarmConnect dialog = new StreamFarmConnect(((StreamFarmUI)(e.getSource())));
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		mnFile.add(mntmConnect);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setMnemonic('H');
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StreamFarmUIAbout dialog = new StreamFarmUIAbout();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel JPanelQuery = new JPanel();
		tabbedPane.addTab("Query", null, JPanelQuery, null);
		JPanelQuery.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		JPanelQuery.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl1 = new JLabel("Status : ");
		panel_3.add(lbl1, BorderLayout.WEST);
		
		labelStatus = new JLabel("Not Connected");
		panel_3.add(labelStatus, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		JPanelQuery.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btnSubmit = new JButton("Submit");
		panel_6.add(btnSubmit, BorderLayout.EAST);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Socket skt = new Socket(farmManagerHost, Conts.FARM_MANAGER_PORT);
					labelStatus.setText("Connection with manager host : " + farmManagerHost + " on port : " + Conts.FARM_MANAGER_PORT + ".");
					PrintWriter out = new PrintWriter(skt.getOutputStream());
					BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
					
					BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
				} catch (UnknownHostException ec) {
					ec.printStackTrace();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		});
		btnSubmit.setMnemonic('S');
		
		JTextArea textAreaQuery = new JTextArea();
		panel_5.add(textAreaQuery, BorderLayout.CENTER);
		
		JTextArea textAreaResults = new JTextArea();
		JPanelQuery.add(textAreaResults);
		
		JPanel JPanelMonitor = new JPanel();
		tabbedPane.addTab("Monitor", null, JPanelMonitor, null);
		JPanelMonitor.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		JPanelMonitor.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblApp = new JLabel("App");
		panel_1.add(lblApp, BorderLayout.WEST);
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		JPanelMonitor.add(panel_2, BorderLayout.CENTER);
	}

	/**
	 * @param hostName
	 */
	public void setHostName(String hostName) {
		this.farmManagerHost = hostName;
	}

}
