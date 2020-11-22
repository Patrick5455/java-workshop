import lombok.Data;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableClass {

    /*Exercise 1: Writing Pure Functions
A grocery retail store has a system for managing their stock;
however, the company that built their software has gone bankrupt and has lost all the source code for their system.
This is a system that only allows customers to buy one thing at a time.
Because their customers want to buy two things at a time, never more or less,
they have asked you to implement a function that takes the price of two products and returns the sum of those two prices.
They want you to implement this without causing any side effects or incompatibilities with their current system.
You'll implement this as a pure function*/


    public static void main(String[] args) {

        //implementations
        ShopItem shopItem1 = new ShopItem(1,"Chair", 150);
        ShopItem shopItem2 = new ShopItem(2,"Table",350);


        //Create ShopCart
        ShopCart myFirstCart = new ShopCart(new ArrayList<ShopItem>());

        //Add Items to ShopCart
        ShopCart mySecondCart = myFirstCart.addItem(shopItem1);
        ShopCart myThirdCart = mySecondCart.addItem(shopItem2);
//        myThirdCart.mShoppingItems.forEach(System.out::println);

        //Remove Item from shopCart
       myThirdCart =   myThirdCart.removeItem(shopItem2);

        mySecondCart.mShoppingItems.forEach(
                (item)-> {
                    System.out.println(mySecondCart.getClass().getName());
                    System.out.println(item);
                }
        );

        ShopCart finalMyThirdCart = myThirdCart;
        myThirdCart.mShoppingItems.forEach(
                (item)-> {
                    System.out.println(finalMyThirdCart.getClass().getName());
                    System.out.println(item);
                }
        );


    }


    static final class ShopCart {

        private final List<ShopItem> mShoppingItems;

//        public void addItem(ShopItem shopItem){
//            mShoppingItems.add(shopItem);
//        } // this can still be modified we would rather use the implementations below

        /*
        Looking at this solution from an FP approach,
        we can already see that it will modify the collection.
        This is something that we're desperately trying to avoid
        as multiple people will be working on this shopping cart at the same time.
        In this case, using the final keyword has no impact since the contents of a final list can still change.
        One basic approach to solving this in a functional way is to return a new ShoppingCart when adding an item.
        * */

        public ShopCart(List<ShopItem> shopItems) {
            mShoppingItems = (Collections.unmodifiableList(shopItems));
        }

        public ShopCart addItem(ShopItem shopItem) {
            List<ShopItem> shopItemList = new ArrayList<>(mShoppingItems);
            shopItemList.add(shopItem);
            return new ShopCart(shopItemList);
        }

        public ShopCart removeItem(ShopItem item) {
            long id = item.getId();
            List<ShopItem> tempList = mShoppingItems.stream().collect(Collectors.toList());
            tempList.remove(item);

            return new ShopCart(tempList);

//      mShoppingItems.stream().filter(
//              (streamItem -> streamItem.getId() == id))
//       .}
        }

    }


        @Data
        static final class ShopItem {
            private int price;
            private String name;
            private long id;


            public ShopItem(long id, String name, int price) {
                this.id = id;
                this.name = name;
                this.price = price;
            }

        }

    /*In this code, we can see that the constructor now accepts a list of ShoppingItem classes; we can also see that the list is directly saved as an unmodifiable list.
    This is a special type of list in Java – one that throws an exception whenever you attempt to modify it in any way, either directly or through its iterator.
    We can also see that the addItem(ShoppingItem item) function now returns a new ShoppingCart,
    with a whole new list, but with the items from the previous shopping list shared between the two ShoppingCart instances.
    This is an acceptable solution even for a multithreaded environment as the ShoppingItem classes are final and,
    therefore, may never change their state.*/


    }
