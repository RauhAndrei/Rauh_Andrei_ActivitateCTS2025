package ro.cts.clase;

public class MotorAudio {
    private int volume;
    private boolean isStereo;
    private boolean isMuted;
    private static MotorAudio instance;

    private MotorAudio() {
    }

    private MotorAudio(int volume, boolean isStereo, boolean isMuted) {
        this.volume = volume;
        this.isStereo = isStereo;
        this.isMuted = isMuted;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isStereo() {
        return isStereo;
    }

    public void setStereo(boolean stereo) {
        isStereo = stereo;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public static MotorAudio getInstance(int volume, boolean isStereo, boolean isMuted) {
        if (instance == null) {
            instance = new MotorAudio(volume, isStereo, isMuted);
        }
        return instance;
    }

    public static void setInstance(MotorAudio instance) {
        MotorAudio.instance = instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MotorAudio{");
        sb.append("volume=").append(volume);
        sb.append(", isStereo=").append(isStereo);
        sb.append(", isMuted=").append(isMuted);
        sb.append('}');
        return sb.toString();
    }
}
