package org.fundacionjala.coding.Ruber.Principles.InterfaceSegregation.Good;

import java.util.Date;

public class DVD implements Product, AgeAware {
    @Override
    public int getRecommendedAge() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public int getNumberOfDisks() {
        return 0;
    }

    @Override
    public Date getReleaseDate() {
        return null;
    }
}
