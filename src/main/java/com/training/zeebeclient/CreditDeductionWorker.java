package com.training.zeebeclient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;

import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;

@Component
public class CreditDeductionWorker {

  Logger LOGGER = LoggerFactory.getLogger(CreditDeductionWorker.class);

  @ZeebeWorker(type = "credit-deduction")
  public void handleCreditDeduction(final JobClient jobClient, final ActivatedJob job) {
    LOGGER.info("Task definition type: " + job.getType());
    jobClient.newCompleteCommand(job).send().join();
  }
}