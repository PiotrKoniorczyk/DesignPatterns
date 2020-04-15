package Adapter.Adapter_Practice;

import Adapter.Adapter_Practice.Adapter.APIAdapter;
import Adapter.Adapter_Practice.NewLibrary.LibraryAPIv2;
import Adapter.Adapter_Practice.NewLibrary.LibraryAPIv2Impl;
import Adapter.Adapter_Practice.OldLibrary.BookConnector;
import Adapter.Adapter_Practice.OldLibrary.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(user, libraryAPIv2);
        BookConnector connector = new BookConnector(user,apiAdapter);
        connector.checkAviability("Harry Potter i Zakon Feniksa");
    }
}
