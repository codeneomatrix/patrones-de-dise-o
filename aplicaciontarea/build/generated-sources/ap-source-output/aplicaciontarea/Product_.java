package aplicaciontarea;

import aplicaciontarea.PurchaseOrder;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-07T22:52:01")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, BigDecimal> purchaseCost;
    public static volatile SingularAttribute<Product, String> productCode;
    public static volatile SingularAttribute<Product, Integer> productId;
    public static volatile SingularAttribute<Product, BigDecimal> markup;
    public static volatile ListAttribute<Product, PurchaseOrder> purchaseOrderList;
    public static volatile SingularAttribute<Product, Integer> quantityOnHand;
    public static volatile SingularAttribute<Product, Integer> manufacturerId;
    public static volatile SingularAttribute<Product, String> available;
    public static volatile SingularAttribute<Product, String> description;

}