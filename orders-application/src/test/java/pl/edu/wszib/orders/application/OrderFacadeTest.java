package pl.edu.wszib.orders.application;

import org.junit.jupiter.api.Test;
import pl.edu.wszib.orders.api.order.OrderResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderFacadeTest {
    private final OrderFacade orderFacade = new OrderFacade();

    @Test
    public void should_be_able_to_create_order() {
        // TODO: task1 impl
        // given:

        // when:

        // then:
    }

    // TODO: task2 propose test methods to cover all use cases
    @Test
    public void should_be_able_to_add_product_to_order() {

    }

    @Test
    public void should_not_be_able_to_find_not_existing_order() {
    }

    @Test
    public void should_be_able_to_find_existing_order_by_id() {
        // given: we have properly created order
        String existingOrderId = orderFacade.create().success().id();

        // when: we try to find order by its id
        OrderResult result = orderFacade.getById(existingOrderId);

        // then: result is success
        assertTrue(result.isSuccess());
        // and: resulting order has the same id as we looked for
        assertEquals(existingOrderId, result.success().id());
    }


}
