package com.upgrad.practice;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Profile("qa")
@Component
public class MyService {
}
