package iddd.efk.freelancercontext;


public class CommunicationChannel {
    private final CommuicationChannelType commuicationChannelType;
    private final String value;

    public CommunicationChannel(
            CommuicationChannelType commuicationChannelType,
            String value
    ) {
        this.commuicationChannelType = commuicationChannelType;
        this.value = value;
    }

    public CommuicationChannelType getCommuicationChannelType() {
        return commuicationChannelType;
    }

    public String getValue() {
        return value;
    }
}
