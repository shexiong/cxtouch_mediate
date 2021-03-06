package com.cxplan.projection.mediate.message.filter;

import com.cxplan.projection.mediate.message.Message;
import com.cxplan.projection.mediate.message.MessageFilter;

/**
 * Filters for packets with a particular packet ID.
 *
 * Created on 2018/5/19.
 * @author kenny
 */
public class MessageIDFilter implements MessageFilter {

    private String packetID;
    private String cmd;

    /**
     * Creates a new packet ID filter using the specified packet ID.
     *
     * @param packetID the packet ID to filter for.
     */
    public MessageIDFilter(String packetID, String cmd) {
        if (packetID == null) {
            throw new IllegalArgumentException("Packet ID cannot be null.");
        }
        this.packetID = packetID;
        this.cmd = cmd;
    }

    public boolean accept(Message packet) {
        return packetID.equals(packet.getId());
    }

    public String toString() {
        return "MessageIDFilter by id: " + packetID;
    }
}
