package realestatemultilist;

/*
 *
 * Objective:    The objective of the program is to define
 *               the Real Estate Property class definition with
 *               the private data members, constants,
 *               constructors, as well as methods
 *
 *
 *
 *
 * Author:       Dylan Dietrick
 *
 * Date:         6/22/19
 *
*/

// Inheritance and abstract can be added later, as well as Commercial and Residential classes.

// Real Estate Property Extends from Real Estate classes but those programs are not included here
public class RealEstateMultiListProperty
{
    // Data members (or fields) for the Real Estate Properties (MultiList)
    private int    realEstateRecordNumber;
    private int    realEstateCompanyNumber;
    private int    realEstateListingAgentNumber;
    private int    realEstateMultiListNumber;
    private int    realEstateParcelNumber;
    private String realEstateParcelIdentification;
    private String realEstatePropertyType;
    private String realEstatePropertyAddress;
    private String realEstatePropertyCity;
    private String realEstatePropertyState;
    private String realEstatePropertyZip;
    private double realEstateAskingPrice;
    private double realEstateLandValue;
    private double realEstateBuildingValue;

    // This is the default constructor (no-argument)
    public RealEstateMultiListProperty()
    {
        realEstateRecordNumber         = 0;
        realEstateCompanyNumber        = 1;
        realEstateListingAgentNumber   = 0001;
        realEstateMultiListNumber      = 2345;
        realEstateParcelNumber         = 34567;
        realEstateParcelIdentification = "123456789012345678901234567890";
        realEstatePropertyType         = "123456789012345678901234567890";
        realEstatePropertyAddress      = "123456789012345678901234567890";
        realEstatePropertyCity         = "123456789012345678901234567890";
        realEstatePropertyState        = "123456789012345678901234567890";
        realEstatePropertyZip          = "123456789012345678901234567890";
        realEstateAskingPrice          = 199000.00;
        realEstateLandValue            = 50000.00;
        realEstateBuildingValue        = 50000.00;
    }

    // Constructor
    public RealEstateMultiListProperty(
                              int    realEstateRecordNumber,
                              int    realEstateCompanyNumber,
                              int    realEstateListingAgentNumber,
                              int    realEstateMultiListNumber,
                              int    realEstateParcelNumber,
                              String realEstateParcelIdentification,
                              String realEstatePropertyType,
                              String realEstatePropertyAddress,
                              String realEstatePropertyCity,
                              String realEstatePropertyState,
                              String realEstatePropertyZip,
                              double realEstateAskingPrice,
                              double realEstateLandValue,
                              double realEstateBuildingValue)

    {
        this.realEstateRecordNumber         = realEstateRecordNumber;
        this.realEstateCompanyNumber        = realEstateCompanyNumber;
        this.realEstateListingAgentNumber   = realEstateListingAgentNumber;
        this.realEstateMultiListNumber      = realEstateMultiListNumber;
        this.realEstateParcelNumber         = realEstateParcelNumber;
        this.realEstateParcelIdentification = realEstateParcelIdentification;
        this.realEstatePropertyType         = realEstatePropertyType;
        this.realEstatePropertyAddress      = realEstatePropertyAddress;
        this.realEstatePropertyCity         = realEstatePropertyCity;
        this.realEstatePropertyState        = realEstatePropertyState;
        this.realEstatePropertyZip          = realEstatePropertyZip;
        this.realEstateAskingPrice          = realEstateAskingPrice;
        this.realEstateLandValue            = realEstateLandValue;
        this.realEstateBuildingValue        = realEstateBuildingValue;
    }

    // Mutator method to set the real estate record number
    public void setRealEstateRecordNumber(int realEstateRecordNumber)
    {
        this.realEstateRecordNumber   = realEstateRecordNumber;
    }

    // Accessor method to get the real estate record number
    public int getRealEstateRecordNumber()
    {
        return realEstateRecordNumber;
    }

    // Mutator method to set the real estate company number
    public void setRealEstateCompanyNumber(int realEstateCompanyNumber)
    {
        this.realEstateCompanyNumber   = realEstateCompanyNumber;
    }

    // Accessor method to get the real estate company number
    public int getRealEstateCompanyNumber()
    {
        return realEstateCompanyNumber;
    }

    // Mutator method to set the real estate listing agent number
    public void setRealEstateListingAgentNumber(int realEstateListingAgentNumber)
    {
        this.realEstateListingAgentNumber = realEstateListingAgentNumber;
    }

    // Accessor method to get the real estate listing agent number
    public int getRealEstateListingAgentNumber()
    {
        return realEstateListingAgentNumber;
    }

    // Mutator method to set the real estate multilist number
    public void setRealEstateMultiListNumber(int realEstateMultiListNumber)
    {
        this.realEstateMultiListNumber = realEstateMultiListNumber;
    }

    // Accessor method to get the real estate multilist number
    public int getRealEstateMultiListNumber()
    {
        return realEstateMultiListNumber;
    }

        // Mutator method to set the real estate parcel number
    public void setRealEstateParcelNumber(int realEstateParcelNumber)
    {
        this.realEstateParcelNumber = realEstateParcelNumber;
    }

    // Accessor method to get the real estate parcel number
    public int getRealEstateParcelNumber()
    {
        return realEstateParcelNumber;
    }

    // Mutator method to set the real estate parcel identification
    public void setRealEstateParcelIdentification(String realEstateParcelIdentification)
    {
        this.realEstateParcelIdentification = realEstateParcelIdentification;
    }

    // Accessor method to get the real estate parcel identification
    public String getRealEstateParcelIdentification()
    {
        return realEstateParcelIdentification;
    }

    // Mutator method to set the real estate property type
    public void setRealEstatePropertyType(String realEstatePropertyType)
    {
        this.realEstatePropertyType = realEstatePropertyType;
    }

    // Accessor method to get the real estate property type
    public String getRealEstatePropertyType()
    {
        return realEstatePropertyType;
    }

    // Mutator method to set the real estate property address
    public void setRealEstatePropertyAddress(String realEstatePropertyAddress)
    {
        this.realEstatePropertyAddress = realEstatePropertyAddress;
    }

    // Accessor method to get the real estate property address
    public String getRealEstatePropertyAddress()
    {
        return realEstatePropertyAddress;
    }

    // Mutator method to set the real estate property city
    public void setRealEstatePropertyCity(String realEstatePropertyCity)
    {
        this.realEstatePropertyCity = realEstatePropertyCity;
    }

    // Accessor method to get the real estate property city
    public String getRealEstatePropertyCity()
    {
        return realEstatePropertyCity;
    }

    // Mutator method to set the real estate property state
    public void setRealEstatePropertyState(String realEstatePropertyState)
    {
        this.realEstatePropertyState = realEstatePropertyState;
    }

    // Accessor method to get the real estate property state
    public String getRealEstatePropertyState()
    {
        return realEstatePropertyState;
    }

    // Mutator Method to set the real estate property zip code
    public void setRealEstatePropertyZip(String realEstatePropertyZip)
    {
        this.realEstatePropertyZip = realEstatePropertyZip;
    }

    // Accessor method to get the real estate property zip code
    public String getRealEstatePropertyZip()
    {
        return realEstatePropertyZip;
    }

    // Mutator Method to set the real estate property asking price
    public void setRealEstateAskingPrice(double realEstateAskingPrice)
    {
        this.realEstateAskingPrice = realEstateAskingPrice;
    }

    // Accessor Method to get the real estate property asking price
    public double getRealEstateAskingPrice()
    {
        return realEstateAskingPrice;
    }

    // Mutator Method to set the real estate land value
    public void setRealEstateLandValue(double realEstateLandValue)
    {
         this.realEstateLandValue = realEstateLandValue;
    }

    // Accessor Method to get the real estate land value
    public double getRealEstateLandValue()
    {
        return realEstateLandValue;
    }

    // Mutator Method to set the real estate building value
    public void setRealEstateBuildingValue(double realEstateBuildingValue)
    {
         this.realEstateBuildingValue = realEstateBuildingValue;
    }

    // Accessor Method to get the real estate building value
    public double getRealEstateBuildingValue()
    {
        return realEstateBuildingValue;
    }

    // Abstract class after working ********************
    public double getRealEstatePropertyValue()
    {
        double realEstatePropertyValue = realEstateLandValue +
                                         realEstateBuildingValue;
        return realEstatePropertyValue;
    }

    // Method to show the real estate object
    @Override
    public String toString()
    {
        StringBuilder bufferArea = new StringBuilder();

        bufferArea.append(getRealEstateRecordNumber());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateCompanyNumber());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateListingAgentNumber());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateMultiListNumber());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateParcelNumber());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateParcelIdentification());
        bufferArea.append("\n");

        bufferArea.append(getRealEstatePropertyType());
        bufferArea.append("\n");

        bufferArea.append(getRealEstatePropertyAddress());
        bufferArea.append("\n");

        bufferArea.append(getRealEstatePropertyCity());
        bufferArea.append("\n");

        bufferArea.append(getRealEstatePropertyState());
        bufferArea.append("\n");

        bufferArea.append(getRealEstatePropertyZip());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateAskingPrice());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateLandValue());
        bufferArea.append("\n");

        bufferArea.append(getRealEstateBuildingValue());
        bufferArea.append("\n");

        bufferArea.append(getRealEstatePropertyValue());
        bufferArea.append("\n");

        bufferArea.append("End");

        return bufferArea.toString();
    }
} // End of the class
