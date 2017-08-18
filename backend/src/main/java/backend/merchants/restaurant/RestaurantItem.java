package backend.merchants.restaurant;

import backend.merchants.Item;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.annotation.Subclass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad on 24/07/2017.
 */
@Subclass(index = true)
public class RestaurantItem extends Item {
    @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
    public List<Key<RestaurantItemOption>> options = new ArrayList<>();
    //default constructor for Entity initialization

    public RestaurantItem() {
    }

    public RestaurantItem(String name, double basePrice) {
        super(name, basePrice);
    }

    public void addOptionToThisItem(Long optionID){
        Key<RestaurantItemOption> optionKey = Key.create(RestaurantItemOption.class,optionID);
        this.options.add(optionKey);
        ObjectifyService.ofy().save().entity(this).now();// save changes in this category
    }
}