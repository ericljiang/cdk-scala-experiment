package com.myorg;

import software.amazon.awscdk.App;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.scalatest.flatspec.AnyFlatSpec

class CdkScalaExperimentTest extends AnyFlatSpec {

  private val JSON = new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true)

  "A CdkScalaExperimentApp" should "contain no resources" in {
    val app = new App
    val stack = new CdkScalaExperimentStack(app, "test")
    assertResult(new ObjectMapper().createObjectNode) {
      JSON.valueToTree(app.synth.getStackArtifact(stack.getArtifactId).getTemplate)
    }
  }
}
