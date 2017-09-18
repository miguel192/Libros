package com.example.miguel.books.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
         //   addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    // declaramos nuevas varibales para los nuevos parametros de nuestra lista
    public static class DummyItem {
        public final String id;
        public final String book_name;
        public final String buyable_link;
        public final String book_image;

        public DummyItem(String id, String book_name, String buyable_link,
                         String book_image) {
            // igualoamos la variables con los parametros que va a resisvir la funcion
            this.id = id;
            this.book_name = book_name;
            this.buyable_link = buyable_link;
            this.book_image = book_image;
        }

        @Override
        public String toString() {
            return book_name;}
    }

    // agregamos los parametros a cada punto de la lista que son id, nombre del libo, link de compra y link de imagen
    static {
        addItem(new DummyItem("1", "MERCEDEZ-BENZ (DRIVEN TO DELIGHT)", "https://www.gonvill.com.mx/libro/mercedez-benz-driven-to-delight_00103399", "https://images-na.ssl-images-amazon.com/images/I/51ukY1G3A%2BL._SR600,315_SCLZZZZZZZ_.jpg"));
        addItem(new DummyItem("2", "GRAN LIBRO DE PROGRAMACION ", "https://www.gonvill.com.mx/libro/gran-libro-de-programacion-avanzada-con-android-el_07107704", "http://www.ongrafo.com/libros/lote25/imagenes/SAM_0001.JPG"));
        addItem(new DummyItem("3", "PROGRAMACION DE BASES DE DATOS", "https://www.gonvill.com.mx/libro/programacion-de-bases-de-datos-con-mysql-y-php_07107428", "http://www.llibreriaha.com/img/libros/9788426714688.jpg"));
    }
}
