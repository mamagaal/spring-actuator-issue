package com.example.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface OfferingStream {

    String INPUT_PRICING_ELE = "input-pricing";
    String OUTPUT_PRICING_ELE = "output-pricing";

    @Input(INPUT_PRICING_ELE)
    SubscribableChannel inboundPricingEle();

    @Output(OUTPUT_PRICING_ELE)
    MessageChannel outboundPricingEle();

}
