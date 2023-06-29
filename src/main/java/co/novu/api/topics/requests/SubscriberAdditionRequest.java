package co.novu.api.topics.requests;

import co.novu.api.topics.pojos.Subscriber;
import co.novu.common.contracts.IRequest;
import lombok.Data;

import java.util.List;

@Data
public class SubscriberAdditionRequest implements IRequest {

    private List<Subscriber> subscribers;
}
