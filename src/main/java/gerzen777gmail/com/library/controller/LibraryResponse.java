package gerzen777gmail.com.library.controller;

import gerzen777gmail.com.library.model.Book;

import java.io.Serializable;
import java.util.List;

public class LibraryResponse implements Serializable {
    private int idRequest;
    private List<Book> result;

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public List<Book> getResult() {
        return result;
    }

    public void setResult(List<Book> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "LibraryResponse{" +
                "idRequest=" + idRequest +
                ", result=" + result +
                '}';
    }
}
