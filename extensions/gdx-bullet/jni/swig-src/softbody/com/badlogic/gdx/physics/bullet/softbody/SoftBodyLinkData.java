/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SoftBodyLinkData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyLinkData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SoftBodyLinkData, normally you should not need this constructor it's intended for low-level usage. */ 
	public SoftBodyLinkData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyLinkData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(SoftBodyLinkData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				SoftbodyJNI.delete_SoftBodyLinkData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setMaterial(SoftBodyMaterialData value) {
    SoftbodyJNI.SoftBodyLinkData_material_set(swigCPtr, this, SoftBodyMaterialData.getCPtr(value), value);
  }

  public SoftBodyMaterialData getMaterial() {
    long cPtr = SoftbodyJNI.SoftBodyLinkData_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyMaterialData(cPtr, false);
  }

  public void setNodeIndices(int[] value) {
    SoftbodyJNI.SoftBodyLinkData_nodeIndices_set(swigCPtr, this, value);
  }

  public int[] getNodeIndices() {
    return SoftbodyJNI.SoftBodyLinkData_nodeIndices_get(swigCPtr, this);
}

  public void setRestLength(float value) {
    SoftbodyJNI.SoftBodyLinkData_restLength_set(swigCPtr, this, value);
  }

  public float getRestLength() {
    return SoftbodyJNI.SoftBodyLinkData_restLength_get(swigCPtr, this);
  }

  public void setBbending(int value) {
    SoftbodyJNI.SoftBodyLinkData_bbending_set(swigCPtr, this, value);
  }

  public int getBbending() {
    return SoftbodyJNI.SoftBodyLinkData_bbending_get(swigCPtr, this);
  }

  public SoftBodyLinkData() {
    this(SoftbodyJNI.new_SoftBodyLinkData(), true);
  }

}
