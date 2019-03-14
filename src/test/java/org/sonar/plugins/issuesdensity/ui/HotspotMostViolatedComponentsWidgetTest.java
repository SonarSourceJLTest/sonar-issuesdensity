/*
 * Issues Density Plugin
 * Copyright (C) 2014 SonarSource
 * sonarqube@googlegroups.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.issuesdensity.ui;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HotspotMostViolatedComponentsWidgetTest {

  HotspotMostViolatedComponentsWidget widget;

  @Before
  public void setUp() throws Exception {
    widget = new HotspotMostViolatedComponentsWidget();
  }

  @Test
  public void widget_definitions() throws Exception {
    assertThat(widget.getId()).isNotNull();
    assertThat(widget.getTitle()).isNotNull();
    assertThat(widget.getTemplatePath()).isNotNull();
  }

  @Test
  public void find_template() {
    assertThat(widget.getClass().getResource(widget.getTemplatePath()))
      .as("Template not found: " + widget.getTemplatePath())
      .isNotNull();
  }
}