package cz.davidkuna.remotecontrolserver.helpers;

/**
 * Created by David Kuna on 25.2.16.
 */
public class Settings {

    private String serverAddress;
    private int cameraUDPPort;
    private int sensorUDPPort;
    private int controlUDPPort;
    private String relayToken = "";

    public String getServerAddress() {
        return serverAddress;
    }

    public Settings setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
        return this;
    }

    public int getCameraUDPPort() {
        return cameraUDPPort;
    }

    public Settings setCameraUDPPort(int cameraUDPPort) {
        this.cameraUDPPort = cameraUDPPort;
        return this;
    }

    public int getSensorUDPPort() {
        return sensorUDPPort;
    }

    public Settings setSensorUDPPort(int sensorUDPPort) {
        this.sensorUDPPort = sensorUDPPort;
        return this;
    }

    public int getControlUDPPort() {
        return controlUDPPort;
    }

    public void setControlUDPPort(int controlUDPPort) {
        this.controlUDPPort = controlUDPPort;
    }

    public String getRelayToken() {
        return relayToken;
    }

    public void setRelayToken(String relayToken) {
        this.relayToken = relayToken;
    }
}
