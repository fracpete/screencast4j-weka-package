/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Screencast4j.java
 * Copyright (C) 2016 FracPete (fracpete at gmail dot com)
 */

package weka.gui;

import com.github.fracpete.screencast4j.gui.ScreencastPanel;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;

/**
 * Adds a "Screencast" menu item to the "Extensions" menu.
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision$
 */
public class Screencast4j
  implements MainMenuExtension {

  /**
   * Returns the name of the submenu. If there is no submenu necessary then
   * the return value is null.
   *
   * @return		the title of the submenu or null if no submenu
   */
  @Override
  public String getSubmenuTitle() {
    return null;
  }

  /**
   * Returns the name of the menu item.
   *
   * @return		the name of the menu item.
   */
  @Override
  public String getMenuTitle() {
    return "Screencast";
  }

  /**
   * If the extension has a custom ActionListener for the menu item, then it
   * must be returned here. Having a custom <code>ActionListener</code> also
   * means that the component handles any frame by itself.
   *
   * @param owner 	the owner of potential dialogs
   * @return		a custom ActionListener, can be null
   * @see		#fillFrame(Component)
   */
  @Override
  public ActionListener getActionListener(JFrame owner) {
    return null;
  }

  /**
   * Fills the frame with life, like adding components, window listeners,
   * setting size, location, etc. The frame object can be either derived from
   * <code>JFrame</code> or from <code>JInternalFrame</code>. This method is
   * only called in case <code>getActionListener()</code> returns null.
   *
   * @param frame	the frame object to embed components, etc.
   * @see		#getActionListener(JFrame)
   * @see		javax.swing.JFrame
   * @see		javax.swing.JInternalFrame
   */
  @Override
  public void fillFrame(Component frame) {
    ScreencastPanel	panel;

    panel = new ScreencastPanel();
    if (frame instanceof JFrame) {
      ((JFrame) frame).getContentPane().setLayout(new BorderLayout());
      ((JFrame) frame).getContentPane().add(panel, BorderLayout.CENTER);
      ((JFrame) frame).setJMenuBar(panel.getMenuBar());
      ((JFrame) frame).setSize(600, 400);
      ((JFrame) frame).setLocationRelativeTo(null);
    }
    else {
      ((JInternalFrame) frame).getContentPane().setLayout(new BorderLayout());
      ((JInternalFrame) frame).getContentPane().add(panel, BorderLayout.CENTER);
      ((JInternalFrame) frame).setJMenuBar(panel.getMenuBar());
      ((JInternalFrame) frame).setSize(600, 400);
    }
  }
}
