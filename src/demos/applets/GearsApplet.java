package demos.applets;

import java.applet.*;
import java.awt.*;
import demos.gears.Gears;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;
import com.jogamp.opengl.util.FPSAnimator;

/** Shows how to deploy an applet using JOGL. This demo must be
    referenced from a web page via an &lt;applet&gt; tag. */

public class GearsApplet extends Applet {
  static {
    GLProfile.initSingleton();
  }
  private Animator animator;

  public void init() {
    setLayout(new BorderLayout());
    GLCanvas canvas = new GLCanvas();
    canvas.addGLEventListener(new Gears());
    canvas.setSize(getSize());
    add(canvas, BorderLayout.CENTER);
    animator = new FPSAnimator(canvas, 60);
  }

  public void start() {
    animator.start();
  }

  public void stop() {
    // FIXME: do I need to do anything else here?
    animator.stop();
  }
}
