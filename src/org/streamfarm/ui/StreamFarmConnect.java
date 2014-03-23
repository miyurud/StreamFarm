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
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

/**
 * @author miyuru
 *
 */
public class StreamFarmConnect extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldHost;
	private StreamFarmUI refToUI;
	
	/**
	 * Method to get the host name
	 */
	
	public String getHostName(){
		return textFieldHost.getText();
	}

	/**
	 * Create the dialog.
	 */
	public StreamFarmConnect() {
		setTitle("StreamFarmUI Connect");
		setBounds(100, 100, 450, 97);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(10, 0));
		{
			JLabel lblHost = new JLabel("host");
			contentPanel.add(lblHost, BorderLayout.WEST);
		}
		{
			textFieldHost = new JTextField();
			contentPanel.add(textFieldHost, BorderLayout.CENTER);
			textFieldHost.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						refToUI.setHostName(((StreamFarmConnect)(e.getSource())).getHostName());
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	/**
	 * @param actionListener
	 */
	public StreamFarmConnect(StreamFarmUI refToUI) {
		this.refToUI = refToUI;
	}

}
