package org.folio.rest.domain;

import org.folio.rest.jaxrs.model.Account;

import io.vertx.core.json.JsonObject;

public final class FeeFineWithLoanClosed {
  private final String loanId;
  private final String feeFineId;

  public FeeFineWithLoanClosed(String loanId, String feeFineId) {
    this.loanId = loanId;
    this.feeFineId = feeFineId;
  }

  public String getLoanId() {
    return loanId;
  }

  public String getFeeFineId() {
    return feeFineId;
  }

  public String toJsonString() {
    return JsonObject.mapFrom(this).toString();
  }

  public static FeeFineWithLoanClosed forFeeFine(Account feeFine) {
    return new FeeFineWithLoanClosed(feeFine.getLoanId(), feeFine.getId());
  }
}
