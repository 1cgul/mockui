package com.example.mockui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainScreenController {

    private final ObservableList<StudyStack> data = FXCollections.observableArrayList();
    @FXML
    private TableView<StudyStack> tv;
    private TableColumn<StudyStack, String> tv_studystack;

}
