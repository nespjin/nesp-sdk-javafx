/*
 * Copyright  2019.  靳兆鲁（1756404649@qq.com）
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.nesp.sdk.javafx.view.window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static com.nesp.sdk.javafx.utils.ControllerUtils.bindHeightAndWidth;

/**
 * ProjectName: Movie_JavaFx_Destop
 * Author: jinzhaolu
 * Date: 19-2-13
 * Time: 上午11:57
 * FileName: AlertMessageBox
 * <p>
 * Description:
 * <p>
 * 弹出窗口
 */
public class AlertMessageBox {
    String title = "";
    String btnY = "";
    String btnN = "";
    String btnC = "";
    String msg = "";
    double width = 400;
    double height = 200;

    Stage window;

    boolean isShow = false;

    public AlertMessageBox(String title, String msg) {
        this.window = new Stage();
        this.title = title;
        this.msg = msg;
    }

    public AlertMessageBox setTitle(String title) {
        this.title = title;
        return this;
    }

    public AlertMessageBox setBtnY(String btnY, OnButtonClickListener onButtonCClickListener) {
        this.onButtonYClickListener = onButtonCClickListener;
        this.btnY = btnY;
        return this;
    }

    public AlertMessageBox setBtnN(String btnN, OnButtonClickListener onButtonCClickListener) {
        this.onButtonNClickListener = onButtonCClickListener;
        this.btnN = btnN;
        return this;
    }

    public AlertMessageBox setBtnC(String btnC, OnButtonClickListener onButtonCClickListener) {
        this.onButtonCClickListener = onButtonCClickListener;
        this.btnC = btnC;
        return this;
    }

    public AlertMessageBox setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public AlertMessageBox setWidth(double width) {
        this.width = width;
        return this;
    }

    public AlertMessageBox setHeight(double height) {
        this.height = height;
        return this;
    }

    public void show() {
        if (isShow) return;
        VBox root = new VBox(10);
        root.setStyle("-fx-background-color: #ffffff");
        Label labelMsg = new Label(msg);
        HBox hBox = new HBox(20);

        if (!btnY.isEmpty()) {
            Button buttonY = new Button(btnY);
            buttonY.setOnAction(actionEvent -> {
                if (onButtonYClickListener != null)
                    onButtonYClickListener.OnClick(buttonY);
            });
            hBox.getChildren().add(buttonY);
        }

        if (!btnC.isEmpty()) {
            Button buttonC = new Button(btnC);
            buttonC.setOnAction(actionEvent -> {
                if (onButtonCClickListener != null)
                    onButtonCClickListener.OnClick(buttonC);
            });
            hBox.getChildren().add(buttonC);
        }

        if (!btnN.isEmpty()) {
            Button buttonN = new Button(btnN);
            buttonN.getStylesheets().add("alertwindow.css");
            buttonN.setOnAction(actionEvent -> {
                if (onButtonNClickListener != null)
                    onButtonNClickListener.OnClick(buttonN);
            });
            hBox.getChildren().add(buttonN);
        }

        root.getChildren().add(labelMsg);
        hBox.setMinHeight(0);

        root.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.BOTTOM_CENTER);

        if (!btnY.isEmpty() || !btnC.isEmpty() || !btnN.isEmpty()) {
            root.getChildren().add(hBox);
        }

        window.setResizable(false);
        window.setScene(new Scene(root));
        window.setMinWidth(width);
        window.setMinHeight(height);
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setWidth(width);
        window.setHeight(height);
        bindHeightAndWidth(root, window);
        isShow = true;
        window.showAndWait();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setResizable(boolean b) {
        window.setResizable(b);
    }

    @Deprecated
    public void hide() {
        if (!isShow) return;
        isShow = false;
        close();
//        window.hide();//Not Use Hide
    }

    public void close() {
        if (!isShow) return;
        isShow = false;
        window.close();
    }

    OnButtonClickListener onButtonYClickListener;
    OnButtonClickListener onButtonCClickListener;
    OnButtonClickListener onButtonNClickListener;

    public interface OnButtonClickListener {
        void OnClick(Button button);
    }
}
