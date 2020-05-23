/*
 * Copyright 2020 Nithyananda University.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nu.sharabheshwara.simple_html_editor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;
 //from w  ww .  ja  v a2  s  .  c  om
public class Main extends Application {
 
    @Override
    public void start(Stage stage) {
        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(245);
        String INITIAL_TEXT = "Lorem ipsum dolor sit "
            + "amet, consectetur adipiscing elit. <i>Nam tortor felis</i>, pulvinar "
            + "<UL><li>a</li><li>a</li><li>a</li></UL>"
            + "aliquam sagittis gravida <b>eu dolor</b>. Etiam sit amet ipsum "
            + "sem.";
        htmlEditor.setHtmlText(INITIAL_TEXT);
        
        Button showHTMLButton = new Button("Produce HTML Code");
        
        showHTMLButton.setOnAction((ActionEvent arg0) -> {
          System.out.println(htmlEditor.getHtmlText());
        });
        
        VBox vbox = new VBox();
        vbox.getChildren().addAll(htmlEditor,showHTMLButton);
        Scene scene = new Scene(vbox);       
        stage.setScene(scene);
        stage.show();
    } 
    public static void main(String[] args) {
        launch(args);
    }
}