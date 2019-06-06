package iddd.efk.freelancercontext;


public class CommunicationChannel {
    private CommuicationChannelType commuicationChannelType;
    private String value;

    public CommunicationChannel(
        CommuicationChannelType commuicationChannelType,
        String value
    ) {
        this.commuicationChannelType = commuicationChannelType;
        this.value = value;
    }
}
