package com.hl46000.hlfaker;

public class BuilInfo {
	private FakeBuilProp device;

    public BuilInfo(FakeBuilProp d) {
        this.device = d;
    }

    public String CreateBuild() {
        StringBuilder sb = new StringBuilder();
        sb.append("# begin build properties\n# autogenerated by buildinfo.sh");
        sb.append("\nro.build.id=").append(this.device.getID());
        sb.append("\nro.build.display.id=").append(this.device.getdisplay());
        sb.append("\nro.build.version.incremental=").append(this.device.getincremental());
        sb.append("\nro.build.version.sdk=19");
        sb.append("\nro.build.version.codename=REL");
        sb.append("\nro.build.version.release=").append(this.device.getRelease());
        sb.append("\nro.build.date=Wed Apr  9 02:52:29 KST 2014");
        sb.append("\nro.build.date.utc=1396979549");
        sb.append("\nro.build.type=").append(this.device.getType());
        sb.append("\nro.build.user=").append(this.device.getUSER());
        sb.append("\nro.build.host=").append(this.device.gethost());
        sb.append("\nro.build.tags=release-keys");
        sb.append("\nro.product.model=").append(this.device.getModel());
        sb.append("\nro.product.brand=").append(this.device.getBrand());
        sb.append("\nro.product.name=").append(this.device.getName());
        sb.append("\nro.product.device=").append(this.device.getDevice());
        sb.append("\nro.product.board=").append(this.device.getBoard());
        sb.append("\nro.product.cpu.abi=").append(this.device.getAbi1());
        sb.append("\nro.product.cpu.abi2=").append(this.device.getAbi2());
        sb.append("\nro.product.manufacturer=").append(this.device.getManufacturer());
        sb.append("\nro.product.locale.language=en");
        sb.append("\nro.product.locale.region=GB");
        sb.append("\nro.wifi.channels=\nro.board.platform=exynos4\n# ro.build.product is obsolete; use ro.product.device\nro.build.product=t03g\n# Do not try to parse ro.build.description or .fingerprint\nro.sf.lcd_density=160");
        sb.append("\nro.build.description=").append(this.device.getDescription());
        sb.append("\nro.build.fingerprint=").append(this.device.getFingerprint());
        sb.append("\nro.build.characteristics=phone");
        sb.append("\nro.build.hidden_ver=N7100XXUFND3\nro.build.changelist=1280411\nro.product_ship=true\nro.chipname=smdk4x12\n# end build properties\n\n#\n# ADDITIONAL_BUILD_PROPERTIES\n#\ndalvik.vm.heapstartsize=8m\ndalvik.vm.heapmaxfree=8m\ndalvik.vm.heapgrowthlimit=96m\ndalvik.vm.heapsize=256m\ndalvik.vm.heapminfree=512k\ndalvik.vm.dexopt-flags=m=y\ndalvik.vm.heaptargetutilization=0.75\ndalvik.vm.stack-trace-file=/data/anr/traces.txt\nro.opengles.version=131072\nro.ril.hsxpa=1\nro.ril.gprsclass=10\nro.config.ringtone=Spectrum.ogg\nro.config.notification_sound=Zirconium.ogg\nro.config.alarm_alert=Scandium.ogg\nro.config.media_sound=Spectrum.ogg\nkeyguard.no_require_sim=true\nro.com.android.dataroaming=true\nro.com.android.dateformat=MM-dd-yyyy\nro.carrier=unknown\nro.com.google.clientidbase=android-samsung\nro.setupwizard.mode=OPTIONAL\npersist.sys.dalvik.vm.lib=libdvm.so\nnet.bt.name=Android\n\n#\n# Misc Properties\n#\nro.com.google.gmsversion=4.4.2_r1\nro.com.google.clientidbase=android-samsung\ngsm.version.ril-impl=\"Samsung RIL(IPC) v1.0\"");
        sb.append("\ngsm.sim.operator.numeric=").append(this.device.getMCC());
        sb.append("\ngsm.sim.operator.alpha=").append(this.device.getMNN());
        sb.append("\ngsm.sim.operator.iso-country=").append(this.device.getISO());
        sb.append("\ngsm.sim.state=READY");
        sb.append("\ngsm.current.phone-type=1");
        sb.append("\ngsm.operator.alpha=").append(this.device.getMNN());
        sb.append("\ngsm.operator.numeric=").append(this.device.getMCC());
        sb.append("\ngsm.operator.iso-country=").append(this.device.getISO());
        sb.append("\ngsm.operator.isroaming=false");
        sb.append("\ngsm.network.type=UMTS");
        sb.append("\ngsm.sim.bstserial=").append(this.device.getSIM());
        return sb.toString();
    }
}
