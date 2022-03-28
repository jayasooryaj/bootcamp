package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    public static void main(String arg[]) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Twinkle");
        bookShop.loadData();


        BookShop bs1 = bookShop.clone();
        bookShop.getBooks().remove(2);
        bs1.setShopName("MySecondStore");

        System.out.println(bookShop);
        System.out.println(bs1);
    }
}
class Book{
        private int bId;
        private String bName;

        public int getbId() {
            return bId;
        }

        public void setbId(int bId) {
            this.bId = bId;
        }

        public String getbName() {
            return bName;
        }

        public void setbName(String bName) {
            this.bName = bName;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bId=" + bId +
                    ", bName='" + bName + '\'' +
                    '}';
        }
    }

class BookShop implements Cloneable{
        private String shopName;
        List<Book> books = new ArrayList<>();

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }

        @Override
        public String toString() {
            return "BookShop{" +
                    "shopName='" + shopName + '\'' +
                    ", books=" + books +
                    '}';
        }

        public void loadData(){
            for(int i=0;i<=10;i++){
                Book book = new Book();
                book.setbId(i);
                book.setbName("Book" + i);
                getBooks().add(book);
            }
        }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        for (Book b : this.getBooks()){
            shop.getBooks().add(b);
        }

        return shop;
    }
}

